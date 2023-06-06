class Solution {
    public int numSquares(int n) {


        /* --- 3 and 4 Square Theorem --- */


        /* 
        if (sqrt * sqrt == n) { return 1; } // Perfect square

	    while (n % 4 == 0) { n = n / 4; } // 4^a (8b + 7)
		
        if (n % 8 == 7) { return 4; }
		

	    for (int i = 1; i * i <= n; i++) { // Sum of two perfect squares
		    int square = i * i;
		    int base = (int) Math.sqrt(n - square);

		    if (base * base == n - square)
			    return 2;
	    }

	    return 3;
        */



        /* --- Dynamic Programming --- */


    
        int[] dp = new int[n+1];
        dp[0] = 0;

        for ( int i = 1; i <= n; i++ ) {

            dp[i] = i; // adding 1 sqared n times

            for ( int j = 1; j*j <= i; j++ ) {

                int fittingSquare = j*j;
                dp[i] = Math.min(dp[i], 1 + dp[ i - fittingSquare ]);   // checks if there is a perfect square that fits 
                                                                        //into i and subtracts previous additions to
                                                                        // reach j^2
            }

        }

        return dp[n];
    }
}