# Scripting homework
## `smake`(*S*imple *make*) (Required)
[`make`](https://en.wikipedia.org/wiki/Make_(software)) is a common utility loved by many programmers. But newbies often get intimidated by the syntax of `Makefile`.  
In this problem, we are going to implement a simple `make` without a `Makefile`.  
If you know nothing about `make`, don't worry! You only need to follow the instructions in the requirement section.
### Requirement(s)
Our implementation of `smake` needs to have 4 basic functions:  
    - Compile C code with `gcc` . (`smake compile`)  
    - Install the binary. (`smake install`)  
    - Clean the files generated when compiling. (`smake clean`)  
    - Show the help message. (`smake help`)  
You may safely assume that:  
    - There are only numbers(0-9), characters(a-z,A-Z), hyphens(-) and underscores(_) in filenames.  
    - All C code is fairly simple, that is, it only uses standard libraries and there are no self-defined headers used.  
Each function's detailed description is listed below.  
#### `smake compile`
##### Usage
```sh
smake compile
```
When invoking `smake` with `compile`, `smake` should run the following `gcc` commands on each `*.c` file under the current directory and generate the corresponding binary.
```sh
gcc -c test.c
gcc test.o -o test
```
If one of the command above goes wrong, your script should print an error message then exit immediately.  
```sh
$~ smake compile
smake: smake didn't sucessfully compile because some errors arose.
```
##### Tips
You would like to have a look at `basename`.  
#### `smake install`
##### Usage
```sh
smake install DESTINATION INSTALLFILELIST
```
When invoking `smake` with `install`, `smake` should read the binaries named in `INSTALLFILELIST`, and copy them from the current directory to `DESTINATION`.  
```sh
$~ smake install ~/bin/ Installfile
```
If `INSTALLFILE` doesn't exist:  
```sh
$~ smake install ~/bin/ nonexistingfile
smake: This Installfile doesn't exist!
```
If `DESTINATION` doesn't exist or it's not a directory:  
```sh
$~ smake install ~/noadir Installfile
smake: Please use a valid destination!
```
##### Syntax of `INSTALLFILE`
```sh
binary1
binary2
binary3
...
```
##### Tips
You would like to have a look at `install`.  
#### `smake clean`
##### Usage
```sh
smake clean
```
When invoking `smake` with `clean`, it will remove all files that end with `.o` under the current directory. In addition, this command also asks user whether to remove the binary file:  
```sh
$~ smake clean
smake: Do you want to remove the binary file? (y/N)evil
smake: Please answer y/N!
$~ smake clean
smake: Do you want to remove the binary file? (y/N)y
smake: Enter your binary file name:helloworld
smake: All files have been removed.
$~ smake clean
smake: Do you want to remove the binary file? (y/N)y
smake: Enter your binary file name:nonexistingfile
smake: Please enter an existing filename!
$~ smake clean
smake: Do you want to remove the binary file? (y/N)N
```
If there are no `.o` files and the user doesn't want to remove the binary file, output "Nothing to be done here, exiting...":  
```sh
$~ smake clean
smake: Do you want to remove the binary file? (y/N)N
smake: Nothing to be done here, exiting...
```
Your script may not remove files other than `.o` and the binary.  
#### `smake help`
##### Usage
```sh
smake help
```
This function prints the usages.
```sh
$~ smake help
smake usage:
smake compile
smake install DESTINATION INSTALLFILELIST
smake clean
smake help
```
#### Others
If the user use the wrong command syntax, print `smake help`:  
```sh
$~ smake intall
smake usage:
smake compile
smake install DESTINATION INSTALLFILELIST
smake clean
$~ smake compile ~/bin
smake usage:
smake compile
smake install DESTINATION INSTALLFILELIST
smake clean
```
### Test
You can make a use of the `*.c` files under `test/` directory.
