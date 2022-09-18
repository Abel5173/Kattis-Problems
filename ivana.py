n = int(input())
l = [int(i) for i in input().split()]
cnt = 0
odd = filter(lambda x: x % 2 == 1, l)
for i in odd:
    iv = []
    zv = []
    c = []
    iv.append(i)
    c.append(i)
    y = l.index(i)
    d = 1
    for x in range(len(l)):
        if l[(y-1) % n] % 2 == 1 and l[(y-1) % n] not in c and d % 2 == 1:
            zv.append(l[(y-1) % n])
            c.append(l[(y-1) % n])
            d += 1
        elif l[(y+1) % n] % 2 == 1 and l[(y+1) % n] not in c and d % 2 == 1:
            zv.append(l[(y+1) % n])
            c.append(l[(y+1) % n])
            d += 1
        if l[(y-1) % n] % 2 == 1 and l[(y-1) % n] not in c and d % 2 == 0:
            iv.append(l[(y-1) % n])
            c.append(l[(y-1) % n])
            d += 1
        elif l[(y+1) % n] % 2 == 1 and l[(y+1) % n] not in c and d % 2 == 0:
            iv.append(l[(y+1) % n])
            c.append(l[(y+1) % n])
            d += 1
