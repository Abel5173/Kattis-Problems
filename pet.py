maxS = 0
for i in range(1, 6):
    a = list(map(int, input().split()))
    if maxS < sum(a):
        maxS = sum(a)
        b = i
print(b, maxS)
