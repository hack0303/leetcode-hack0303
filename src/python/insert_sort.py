#!/usr/bin/python3
# -*- coding: UTF-8 -*-

inArray=[4,3,5,123,12]

def insert_sort(aArray):
    print("origin array is ",aArray)
    #range is [x,y) not is [x,y]
    for x in range(1,len(aArray)):
        key=aArray[x]
        y=x-1;
        while aArray[y] > key and y >=0:
            aArray[y+1]=aArray[y]
            y-=1
        aArray[y+1]=key
    print("after sort is ",aArray)



insert_sort(inArray)
