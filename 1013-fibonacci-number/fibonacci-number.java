class Solution {
    public int fib(int n) {
        // 1. BASE CASE: Stops recursion from running forever.
        if (n == 0) return 0;
        if (n == 1) return 1;

        // 2. RECURSIVE CASE: Break the problem down.
        int leftBranch = fib(n - 1);
        int rightBranch = fib(n - 2);

        return leftBranch + rightBranch;
    }
}
