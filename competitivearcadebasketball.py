d = {}
n, p, m = map(int, input().split())
for i in range(n):
    a = input()
    d.update({a: 0})
for i in range(m):
    a, b = input().split()
    b = int(b)
    d[a] += b
l = []
for i in d:
    if d[i] >= p:
        l.append(i)

if len(l) != 0:
    for i in l:
        print(i, "wins!")
else:
    print("No winner!")
