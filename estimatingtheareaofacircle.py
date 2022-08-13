import math


while True:
    r, m, c = map(float, input().split())
    if r == m == c == 0:
        exit()
    else:
        area = math.pi*r*r
        S_area = (2*r)**2*(c/m)
        print(area, ' ', S_area)
