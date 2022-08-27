n = int(input())
for i in range(n):
    l = [int(m) for m in input().split()]
    for j in range(2, len(l)):
        if l[j] - l[j-1] != 1:
            print(j)
            break