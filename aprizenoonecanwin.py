n, m = map(int, input().split())
l = [int(i) for i in input().split()]
cnt = 1
l.sort()
for i in range(1, n):
    if l[i-1]+l[i] <= m:
        cnt += 1
print(cnt)
