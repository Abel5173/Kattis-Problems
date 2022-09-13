from itertools import combinations

n = int(input())
arr = [int(i) for i in input().split()]
s = 0
for i in range(1, n+1):
    p = list(filter(lambda x: sum(x) >= 200, combinations(arr, i)))
    for i in p:
        s += sum(i)
print(s)
