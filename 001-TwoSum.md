# 001 - Two Sum

---

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

## Python

*	列表 按value查询key

```

class Solution(object):

    def twoSum(self, nums, target):

        """
	type nums: List[int]
	type target: int
	rtype: List[int]
	"""
	self.nums = nums
	self.target = target

	for i in range(0,len(nums)):
		if target-nums[i] in nums and i != nums.index(target-nums[i]):
		return [i, nums.index(target-nums[i])]

```

## Java

*	哈希 hashmap

```
public int[] twoSum(int[] nums, int target) {
    
    int[] res = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(i = 0; i < nums.length; i++) {
    	if(map.containsKey(target - nums[i]) {
	    res[0] = map.get(target - nums[i]);
	    res[1] = i;
	}
        map.put(nums[i], i];
	
    }
    return res;
}

```
