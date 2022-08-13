n = int(input())
cnt = 0
l = []
for i in range(n):
    a = input()
    l.append(a)
c = []
for i in range(1, n):
    c.append(l[i])
for i in range(len(c)):
    if c[i] == l[i]:
        cnt += 1
print(cnt)
