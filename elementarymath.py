n = int(input())
l = []
for i in range(n):
    a, b = map(int, input().split())
    l.append([a, b])
m = []
b = False
for i in l:
    if i[0]+i[1] not in m:
        m.append(i[0]+i[1])
    elif i[0]-i[1] not in m:
        m.append(i[0]-i[1])
    elif i[0]*i[1] not in m:
        m.append(i[0]*i[1])
    else:
        b = True
        break
if b:
    print('impossible')
else:
    k = []
    for i in l:
        if i[0]+i[1] not in k:
            print(i[0], '+', i[1], '=', (i[0]+i[1]))
            k.append(i[0]+i[1])
        elif i[0]-i[1] not in k:
            print(i[0], '-', i[1], '=', (i[0]-i[1]))
            k.append(i[0]-i[1])
        elif i[0]*i[1] not in k:
            print(i[0], '*', i[1], '=', (i[0]*i[1]))
            k.append(i[0]*i[1])
