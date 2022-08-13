import math


b, k, g = map(int, input().split())
a = k//g
if b <= a:
    print(1)
else:
    c = math.ceil(b/a)
    print(c)
