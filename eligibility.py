n = int(input())
for i in range(n):
    x = input()
    name, post_secondary_studies, born, courses = x.split()
    pss = post_secondary_studies.split('/')
    b = born.split('/')
    psy = int(pss[0])
    by = int(b[0])
    c = int(courses)
    if psy >= 2010:
        print(name, 'eligible')
    elif by >= 1991:
        print(name, 'eligible')
    elif c >= 41:
        print(name, 'ineligible')
    else:
        print(name, 'coach petitions')
