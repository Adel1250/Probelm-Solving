'use strict'

const twoSum = function (nums, target) {
    const res = [];
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if ((nums[i] + nums[j]) === target) {
                res.push(i);
                res.push(j);
                return res;
            }
        }
    }
    return res;
}

const res = twoSum([2, 8, 11, 15], 10);
console.log(res);