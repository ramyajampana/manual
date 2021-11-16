rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git init
Reinitialized existing Git repository in C:/Users/rj21189/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual/.git/

rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git add .

rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   mysq.txt


rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git commit -m "firstcommit"
[main 676134d] firstcommit
 Committer: Ramya Jampana <rj21189@corp.ojas-it.com>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 31 insertions(+)
 create mode 100644 mysq.txt

rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git push


rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 755 bytes | 755.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ramyajampana/manual.git
   80fea89..676134d  main -> main

rj21189@OJAS-DD459 MINGW64 ~/OneDrive - Ojas Innovative Technologies Pvt Lt/Desktop/manual (main)
$ git push
Everything up-to-date


