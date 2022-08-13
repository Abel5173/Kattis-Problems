import math

T = int(input())
while T > 0:
    v, a, x, h1, h2 = map(float, input().split())
    a = math.radians(a)
    t = x/(v*round(math.cos(a), 1))
    y = (x*(math.tan(a)))-((9.81*(t**2))/2)
    if h1 < y < h2:
        print('Safe')
    else:
        print('Not Safe')
    T -= 1
