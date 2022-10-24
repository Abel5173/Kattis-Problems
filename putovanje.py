n, c = map(int, input().split())
m = 0
l = [int(i) for i in input().split()]
for i in range(n):
    x = 0
    a = 0
    for j in range(i, n):
        if a + l[j] <= c:
            a += l[j]
            x += 1
    m = max(m, x)
print(m)
