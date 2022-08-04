AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   syllabus.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        week1/

no changes added to commit (use "git add" and/or "git commit -a")

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git add .
warning: LF will be replaced by CRLF in week1/blue/blueberries.
The file will have its original line endings in your working directory

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        modified:   syllabus.md
        new file:   week1/blue/blueberries
        new file:   week1/blue/bottle
        new file:   week1/blue/sky
        new file:   week1/blue/water
        new file:   week1/cat1
        new file:   week1/dog
        new file:   week1/full-stack.md
        new file:   week1/full-stack.png
        new file:   week1/git.md
        new file:   week1/green/grass
        new file:   week1/os.md
        new file:   week1/platforms.md
        new file:   week1/unix-commands.md
        new file:   week1/unix-demo.md


AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git push
Everything up-to-date

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git commit -m "Added some notes files"
[main 1a3c658] Added some notes files
 15 files changed, 298 insertions(+), 1 deletion(-)
 create mode 100644 week1/blue/blueberries
 create mode 100644 week1/blue/bottle
 create mode 100644 week1/blue/sky
 create mode 100644 week1/blue/water
 create mode 100644 week1/cat1
 create mode 100644 week1/dog
 create mode 100644 week1/full-stack.md
 create mode 100644 week1/full-stack.png
 create mode 100644 week1/git.md
 create mode 100644 week1/green/grass
 create mode 100644 week1/os.md
 create mode 100644 week1/platforms.md
 create mode 100644 week1/unix-commands.md
 create mode 100644 week1/unix-demo.md

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git push
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 8 threads
Compressing objects: 100% (13/13), done.
Writing objects: 100% (15/15), 41.16 KiB | 13.72 MiB/s, done.
Total 15 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Revature-Training-1302/notes
   893b5b2..1a3c658  main -> main

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git add .

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git commit -m "Updated number of projects in our repo"
[main 1428edc] Updated number of projects in our repo
 2 files changed, 10 insertions(+), 2 deletions(-)

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git push
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 8 threads
Compressing objects: 100% (5/5), done.
Writing objects: 100% (5/5), 824 bytes | 824.00 KiB/s, done.
Total 5 (delta 3), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (3/3), completed with 3 local objects.
To https://github.com/Revature-Training-1302/notes
   1a3c658..1428edc  main -> main

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git add .

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git commit -m "Fixed typo in syllabus, updated project count to 3 from 2"
[main d7e6db5] Fixed typo in syllabus, updated project count to 3 from 2
 1 file changed, 1 insertion(+), 1 deletion(-)

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 378 bytes | 378.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Revature-Training-1302/notes
   1428edc..d7e6db5  main -> main

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/notes (main)
$ cd ..

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org
$ git clone https://github.com/Revature-Training-1302/demos.git
Cloning into 'demos'...
warning: You appear to have cloned an empty repository.

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org
$ cd demos

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/demos (main)
$ ls

AzureAD+RoryEiffe@Rev-PF3BQEWS MINGW64 ~/Desktop/Revature-Training-Org/demos (main)
$
