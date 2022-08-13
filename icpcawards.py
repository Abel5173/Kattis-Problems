n = int(input())
l = []
d1 = {}
for i in range(n):
    a, b = input().split()
    if a not in l:
        d1.update({a: b})
        l.append(a)
x = 0
for i in d1:
    if x == 12:
        break
    print(i, d1[i])
    x += 1
