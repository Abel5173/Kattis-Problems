a, b, c, d, e = map(int, input().split())
if (b+d) <= e:
    print(a+c)
elif (a > c):
    x = float(a/b)
    print(int((b)*x))
else:
    x = float(c/d)
    print(int(d*x))
