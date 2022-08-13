c = float(input())
L = float(input())
s = float(0)
while L > 0:
    w, l = input().split()
    w = float(w)
    l = float(l)
    s += c * (w * l)
    L -= 1

print('%.7f' % s)
