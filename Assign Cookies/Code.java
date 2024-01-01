import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] children, int[] cookies) {
        // Check for empty arrays
        if (cookies.length == 0 || children.length == 0) return 0;

        Arrays.sort(children); // Sorting the children's greed factor
        Arrays.sort(cookies);  // Sorting the cookie sizes

        int maxContentChildren = 0;
        int cookieIndex = cookies.length - 1;
        int childIndex = children.length - 1;

        // Iterate through the arrays to match children with cookies
        while (cookieIndex >= 0 && childIndex >= 0) {
            // If the cookie is large enough for the child
            if (cookies[cookieIndex] >= children[childIndex]) {
                maxContentChildren++; // Increment count of content children
                cookieIndex--;       // Move to the next cookie
                childIndex--;        // Move to the next child
            } else {
                childIndex--; // If the cookie is too small, check the next child's greed
            }
        }

        return maxContentChildren;
    }
}
