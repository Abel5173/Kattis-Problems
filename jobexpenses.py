n = int(input())
l = [int(num) for num in input().split(" ", n-1)]
s = 0
for i in l:
    if i < 0:
        s += abs(i)
print(s)
