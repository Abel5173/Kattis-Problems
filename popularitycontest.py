n, m = map(int, input().split())
d = {}
for i in range(1, n+1):
    d[i] = []
for i in range(m):
    a, b = map(int, input().split())
    d[a].append(b)
    d[b].append(a)
mc = []
for i in range(1, n+1):
    mc.append(len(d[i]) - i)
print(*mc)
