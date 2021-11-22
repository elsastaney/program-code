import re

def main():
    pswd = input("Enter your Password: ")
    reg = "^(?!querty).*((?!abc).)*(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!#%*?&]{6,8}(.*)(?<!123)$"
    
    pat = re.compile(reg)
    mat = re.search(pat, pswd)
    if mat:
        print("true")
    else:
        print("false")
main()
