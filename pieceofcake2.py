n, h, v = map(int, input().split())
if h < v:
    h = n-h
elif v < h:
    v = n-v
elif h < n/2:
    v = n-v
    h = n-h
else:
    h = n-h
a = h*v*4
print(a)
