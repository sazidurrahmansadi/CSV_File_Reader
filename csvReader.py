import csv
with open('air_quality_Nov2017.csv', 'r') as csvFile:
    reader = csv.DictReader(csvFile)

    headers = reader.fieldnames
    print("Air quality search by......")
    print("(Select between) \n1 = Station \n2 = Air Quality \n3 = Longitude \n4 = Latitude \n5 = Date and Time")

    n = input("ENter your choice: ")
    print("\n")

    if int(n) == 1 :
        user_input = input("Enter the Station name: ")
        flines = csvFile.readline()
        print(flines.rstrip())
        search = csvFile.readlines()

        for i, sline in enumerate(search):
            if user_input.upper() in sline.upper():
                print(sline)
            else: print("Data not found")


    elif int(n) == 2 :
        user_input = input("Enter the Air Quality: ")
        flines = csvFile.readline()
        print(flines.rstrip())
        search = csvFile.readlines()

        for i, sline in enumerate(search):
            if user_input.upper() in sline.upper():
                print(sline)
            else: print("Data not found")


    elif int(n) == 3 :
        user_input = input("Enter the Longitude: ")
        flines = csvFile.readline()
        print(flines.rstrip())
        search = csvFile.readlines()

        for i, sline in enumerate(search):
            if user_input.upper() in sline.upper():
                print(sline)
            else: print("Data not found")


    elif int(n) == 4 :
        user_input = input("Enter the Latitude: ")
        flines = csvFile.readline()
        print(flines.rstrip())
        search = csvFile.readlines()

        for i, sline in enumerate(search):
            if user_input.upper() in sline.upper():
                print(sline)
            else: print("Data not found")

    elif int(n) == 5 :
        user_input = input("Enter the Date and Time: ")
        flines = csvFile.readline()
        print(flines.rstrip())
        search = csvFile.readlines()

        for i, sline in enumerate(search):
            if user_input.upper() in sline.upper():
                print(sline)
            else: print("Data not found")


    else: print("Invalid Input")
