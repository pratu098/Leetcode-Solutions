Approach:

Dynamic Programming:
   - Use two variables, `rob` and `norob`, to represent the maximum amount of money that can be robbed considering the current house and the previous houses, respectively.
   - Initialize both variables to 0.
   - Iterate through the array of houses.
   - For each house, calculate two values:
      - `newRob`: The maximum amount of money that can be robbed if the current house is robbed. It is equal to the sum of the amount robbed from the previous house (`norob`) and the current house's value.
      - `newNoRob`: The maximum amount of money that can be robbed if the current house is not robbed. It is equal to the maximum value between the amount robbed from the previous house (`norob`) and the amount robbed from the previous house (`rob`).
   - Update the values of `rob` and `norob` with the newly calculated values.
   - After iterating through all the houses, return the maximum value between `rob` and `norob`, which represents the maximum amount of money that can be robbed.

Time Complexity:
   - The time complexity is O(n), where n is the number of houses. We iterate through the array once.

Space Complexity:
   - The space complexity is O(1) since we use only two variables (`rob` and `norob`) to store intermediate results.
