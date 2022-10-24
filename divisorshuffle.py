n = int(input())
l = [int(x) for x in input().split()]
m = max(l)
d = set(x for tup in ([i, m//i]
                      for i in range(1, int(m**0.5)+1) if m % i == 0) for x in tup)
x = list(filter(lambda i: i not in d, l))
s = max(x)
print(s, m)
  