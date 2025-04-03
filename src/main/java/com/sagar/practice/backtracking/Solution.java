package com.sagar.practice.backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans=new ArrayList<>();

        solve(ans,nums,target,new ArrayList<>(),0);
        return ans;
    }

    void solve(List<List<Integer>>  ans,int[] nums,int target,List<Integer> temp,int index){

        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
            solve(ans,nums,target-nums[i],temp,i)
            temp.remove(temp.size()-1);
        }
    }
}
