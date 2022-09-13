from sys import flags


n = int(input())
l = []
for i in range(n):
    x = True
    a, b, c = map(str, input().split())
    for j in range(len(l)):
        if c == l[j][2]:
            x = False
            if int(b) > int(l[j][1]):
                l[j] = [a, b, c]
                break
    if x:
        l.append([a, b, c])
for i in range(len(l)):
    l[i] = l[i][0]
l.sort()
print(len(l))   
for i in l:
    print(i)