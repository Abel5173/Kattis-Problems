m = int(input())
n = m
l = sorted([int(i) for i in input().split()], reverse=True)
for i in range(len(l)):
    l[i] = l[i] - (n-1) if l[i]-(n-1) >= 0 else 0
    n -= 1
x = max(l)
print(x+m+1)
