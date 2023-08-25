def showAllGugudan():
    for x in range(2, 9+1):
        for y in range(1, 9+1):
            print("{} * {} = {}".format(x, y, x*y))
        print("")

showAllGugudan();