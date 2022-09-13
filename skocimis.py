l = [int(i) for i in input().split()]
l.sort()
cnt = 0
if l[1]-l[0] <= l[2]-l[1]:
    while l[2] - l[1] > 1:
        if l[2] != l[1]:
            l[1], l[0] = l[0]+(l[1]-l[0])+1, l[1]
            cnt += 1
else:
    while l[1] - l[0] > 1:    
        if l[2] != l[1]:
            l[1], l[2] = l[2]-(l[2]-l[1])-1, l[1]
            cnt += 1
print(cnt)