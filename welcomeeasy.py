def num_subsequences(seq, sub):
    if not sub:
        return 1
    elif not seq:
        return 0
    result = num_subsequences(seq[1:], sub)
    if seq[0] == sub[0]:
        result += num_subsequences(seq[1:], sub[1:])
    return result


n = int(input())
for i in range(1, n+1):
    a = input()
    b = 'welcome to code jam'
    x = num_subsequences(a, b)
    print('Case #'+str(i)+': {0:04d}'.format(x))
