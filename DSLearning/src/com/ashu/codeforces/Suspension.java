package com.ashu.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Suspension {

    public static void main(String[] args) throws IOException {
        // 1. Setup Fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // To build output efficiently

        // 2. Read the number of test cases (t)
        // Note: The input structure is slightly tricky (t, then n, y r, n, y r, etc.)
        // We'll read the first line for 't'.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        // 3. Process each test case
        for (int i = 0; i < t; i++) {

            // The problem input shows 'n' on one line, and 'y r' on the next.
            // Test Case 1:
            // 3  <- n
            // 1 2 <- y r

            // Read the line containing 'n'
            int n = Integer.parseInt(br.readLine());

            // Read the line containing 'y' and 'r'
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            // --- Core Logic (The mathematical part is definitely correct) ---
            // Card Capacity: Max suspensions possible from cards (1 per R, 1 per 2 Y)
            int cardCapacity = r + (y / 2);

            // Max Suspensions = Minimum of (Total Players, Card Capacity)
            int maxSuspensions = Math.min(n, cardCapacity);

            // Append result for fast printing
            sb.append(maxSuspensions).append("\n");
        }

        // 4. Print all results at once
        System.out.print(sb.toString());
    }
}