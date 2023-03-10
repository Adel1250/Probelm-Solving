'use strict';

var buildArray = function (nums) {
    const arr = [];
    for (let i = 0; i < nums.length; i++) {
        arr.push(nums[nums[i]]);
    }
    return arr;
};