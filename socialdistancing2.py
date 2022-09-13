a, b = map(int, input().split())
c = list(map(int, input().split()))
e = 0
o = 0
for x in c:
    if x % 2 == 0:
        e += 1
    else:
        o += 1
m = min(o, e)
a = a//2
print(a-b-m)
