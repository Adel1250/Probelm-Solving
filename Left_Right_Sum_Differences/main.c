#include <stdio.h>
#include <stdlib.h>

int *leftRigthDifference(int *nums, int numsSize)
{
    int *ans = (int *)malloc(numsSize * sizeof(int));
    int leftSum = 0;
    int rightSum = 0;
    for (int i = 0; i < numsSize; i++)
    {
        leftSum = 0;
        rightSum = 0;
        for (int j = i - 1; j >= 0; j--)
        {
            leftSum += nums[j];
        }
        for (int j = i + 1; j < numsSize; j++)
        {
            rightSum += nums[j];
        }
        if ((leftSum - rightSum) < 0)
        {
            ans[i] = (leftSum - rightSum) * -1;
        }
        else
        {
            ans[i] = (leftSum - rightSum);
        }
    }
    return ans;
}

int main()
{
    int arr[1] = {1};
    int *res = leftRigthDifference(arr, 1);
    for (int i = 0; i < 1; i++)
    {
        printf("%d ", *(res + i));
    }
    return 0;
}