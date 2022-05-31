class Solution {
    public int maxArea(int[] height) {
		 int left = 0, right = height.length - 1;
	int water = 0;

	while (left < right) {
		water = Math.max(water, Math.min(height[left], height[right])
				* (right - left));
		if (height[left] < height[right])
			left++;
		else
			right--;
	}

	return water;
    }
}