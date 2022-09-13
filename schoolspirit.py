from textwrap import indent


n = int(input())
l = []
for i in range(n):
    a = int(input())
    l.append(a)
su = 0
for i in range(n):
    su += l[i]*(0.8**i)
su *= 0.2
k = []
for i in range(n):
    s = 0
    x = 0
    for j in range(n):
        if j == i:
            continue
        s += l[j]*(0.8**x)
        x += 1
    k.append(s*0.2)
print(su)
print(sum(k)/n)
