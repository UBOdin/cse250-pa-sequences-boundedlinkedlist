# Project 0: Hello World in Scala!

**Due: Wednesday 09/08/21 Before 5:00 PM**

**Total Points = 30**

## Objectives

In this assignment, you will: 
* Read and understand the course AI policy and late policy
* Review (or learn) Scala basics
    * Where to find/how to use Scala docs.
    * How to edit/compile/debug code in Scala.
    * How to find/read the Scala documentation and use standard libraries
    * How to read and parse a CSV file in Scala
    * How to write a file in Scala

## Useful Resources

Review the lecture notes and provided example code for some insight into the Scala 
syntax.  You will also want to read the Scala references provided below:

* [The Scala API](https://www.scala-lang.org/api/current/index.html)
  * [scala.collections.mutable.Map](https://www.scala-lang.org/api/current/scala/collection/mutable/Map.html)
  * [Scala Collections](https://docs.scala-lang.org/overviews/collections-2.13/introduction.html)
* [Scala Tour](https://docs.scala-lang.org/tour/tour-of-scala.html)
* [Scala Resources](https://docs.scala-lang.org/)
* [ScalaTest: Writing your first test](https://www.scalatest.org/user_guide/writing_your_first_test)
* [Maps in Scala](https://docs.scala-lang.org/overviews/collections-2.13/maps.html)
* [Scala File I/O (Scala Cookbook Excerpt)](https://buffalo.box.com/v/cse250-ScalaCookbookIO)
* [Scala Exercises](https://www.scala-exercises.org/)

## Late Policy

The policy for late submissions on assignments is as follows.  Your project grade is 
the best grade over all per-submission grades (or a 0 if no submissions are made).  
If a submission is made...

* ... more than 5 days before the deadline, your submission is assigned a grade of 5 bonus points + 100% of the points it earns. 
* ... up to than 5 days before the deadline, your submission is assigned a grade of 1 bonus point per full day + 100% of the points it earns.
* ... within 24 hours of the deadline, your submission is assigned a grade of 100% of the points it earns.
* ... up to 24 hours after the deadline, your submission is assigned a grade of 75% of the points it earns.
* ... more than 24 hours after the deadline, but within 48 hours of the deadline, your submission is assigned a grade of 50% of the points it earns.
* ... more than 48 hours after the deadline, it will not be accepted.

You will have the ability to use three grace days throughout the semester, and at most 
two per assignment (since submissions are not accepted after two days).  Using a grace 
day will negate the 25% penalty per day, but will not allow you to submit more than 
two days late.  Please plan accordingly.  You will not be able to recover a grace day 
if you decide to work late and your score was not sufficiently higher.  **Grace days 
are automatically applied** to the first instances of late submissions, **and are 
non-refundable**.  For example, if an assignment is due on a Friday and you make a 
submission on Saturday, you will automatically use a grace day, regardless of whether 
you perform better or not.  **Be sure to test your code before submitting**, especially 
with late submissions **in order to avoid wasting grace days**.

**Keep track of the time if you are working up until the deadline**.  Submissions 
become late after the set deadline.  Keep in mind that **submissions will close 48
hours after hte original deadline** and you will not be able to submit your code after 
that time.

## AI Policy Overview

As a gentle reminder, please re-read the academic integrity policy of the course.  I 
will continue to remind you throughout the semester and hope to avoid any incidents.

### What constitutes a violation of academic integrity?

These bullets should be obvious things not to do (but commonly occur):
* Turning in your friend's code/write-up (obvious).
* Turning in solutions you found on Google with all the variable names changed (should be obvious).  This is a copyright violation, in addition to an AI violation.
* Turning in solutions you found on Google with all the variable names changed and 2 lines added (should be obvious).  This is also a copyright violation.
* Use of Github Autopilot (should be obvious).  This is still in murky legal water, and may be a copyright violation, in addition to being an AI violation.
* Paying someone to do your work.  You may as well not submit the work, since you will fail the exams and the course.
* Posting to forums asking someone to solve assignment problems *(even if you do not receive the solution)*
* Accessing solutions to assignment problems.  

**Note:** Aggregating every { stack overflow answer, result from google, other 
source } because you "understand it" will likely result in full credit on assignments
(if you are not caught), and then failure on every exam.  Exams don't test if you know
how to use Google, but rather test your understanding (i.e., do you understand the 
problem and material well enough to arrive at a solution on your own).  Also, other
students are likely doing the same thing, and then you will be wondering why 10 people
that you don't know have your exact solution.

### What collaboration is allowed?

There is a grey area when it comes to discussing the problems with your peers, and I 
do encourage you to work with one another to discuss course *concepts* related to 
an assignment.  That is the best way to learn and to overcome obstacles.  At the same 
time, you need to be sure you do not overstep and not plagiarize.  Discussions pointing
to relevant course materials are OK.  For example, the following is acceptable advice:

> It would be helpful to review the usage of the stack in the recitation slides from
> week XX.

When working with your peers, we ask that you include attribution; In the header 
comment of the Main function of your submission, please list all peers who you have
discussed the project with.

Explaining every step in detail and/or giving pseudocode that solves the problem
is **not ok**.  For example, the following is **not acceptable** advice:

> I copied the algorithm from the week XX notes into my code at the start of the
> function, created a function that went through the given data and put it into a list, 
> called that function, and then sorted the results.

The first example is OK.  The second example, however, is a summary of your code and
is not acceptable.  Remember that you should never show any of your code to other 
students prior to any deadlines.  Regardless of where you are working, you must always
follow this rule: **Never come away from discussions with your peers with any written
work, either typed or photographed, and especially do not share or allow viewing of
your written code**. 

If you have concerns that you may have overstepped or worked too closely with someone,
please address this with me prior to deadlines for the assignment.  **Even if you have
submitted an assignment that may have violated the course academic integrity policy,
if you approach me *prior to detection* you will not face academic integrity 
proceedings**.  We will address options at that point.

### What resources are allowed?

With all of this said, please feel free to use any { files | examples | tutorials } 
that course staff provides, directly in your code.  Feel free to directly use any
materials from lecture or recitations.  You will never be penalized for doing so,
but must always provide attribution/citation for where you retrieved code from. Just
remember, if you are citing an algorithm that is not provided by us, then you are 
probably overstepping.  

More explicitly, you may use any of the following resources (with proper 
citation/annotation in your code: 
* Any example files posted on the course webpage or Piazza (from lecture or recitation)
* Any code that the instructor provides
* Any code that the TAs provide
* Any code from the [Tour of Scala](https://docs.scala-lang.org/tour/tour-of-scala.html)
* Any code from [Scala Collections](https://docs.scala-lang.org/overviews/collections-2.13/introduction.html)
* Any code from [Scala API](https://www.scala-lang.org/api/2.13.0/)
* Additional references may be provided as the semester progresses, but only those provided publicly by course staff are allowed for use.  These will be listed on Piazza under Resources

**Omitting citation/attribution will result in an AI violation** (and lawsuits later 
in life at your job).  This is true, **even if you are using provided resources**.

Again, **if you think you are going to violate/have violated this policy, please come
talk to a member of the course staff ASAP so we can figure out how to get you on track 
to succeed in the course**.  If you have a question about the validity of a resource, 
please ask a TA or your instructor prior to using it.  If you have already used it, 
please discuss with the instructor to determine a workaround and, at the very least,
avoid an academic integrity infraction.  For example, you might send an email such
as the following to the course instructor:

> Clarus T Example<br/>
> **UBIT**: ctexamp<br/>
> **Person** #: 123456789
> 
> Dear Dr. Kennedy,
> 
> I believe that I may have submitted work that is *{ not fully my own | not properly
> attributed }*.  I wish to retract my submission to preserve academic integrity in
> the course.
> 
> Signed,<br/>
> &nbsp;&nbsp;Clarus T Example

This policy on assignments is here so that you learn the material and how to think 
for yourself.  There is no cognitive benefit achieved by submitting solutions someone
else has written (which likely already exist in some form).

## Collaboration Policy

The policy for collaboration on assignments is as follows:
* All work for this course must be original individual work.
* You must follow the limits on collaboration as defined in the AI policy (i.e., no shared code/etc...)
* You must identify any collaborators (first and last name) on every assignment.  THis can be in a comment at the top of your code submissions or on the first page at the top of your written work, beside your name.

All references must be cited using a comment containing a direct link to the resource, 
as well as a brief description of what was used.  For example, if you reference the 
textbook, a page number and description is sufficient.  If you copy example code from 
the Scala Language API, then include the link to the class page within the API as well
as where the example code resides.

## Instructions

Answer the following questions by submitting your answers to Microbase via the 
"Programming Project 0" assignment.  Make sure your submission is committed and 
pushed into your microbase GIT repository.  Log into Microbase and submit your 
project.

### Supported Platforms 

Scala is based on the Java Virtual Machine, and so will run on most modern 
operating systems.  However, only the following platforms are officially 
supported by this course.
* Ubuntu Linux
* MacOS with [Homebrew](https://brew.sh)

Instructions for Ubuntu should work without change for any Debian-based Linux 
distribution (Ubuntu, PopOS!, Debian, Mint).  

The [Windows Subsystem for Linux](https://docs.microsoft.com/en-us/windows/wsl/about),
along with the [Ubuntu](https://ubuntu.com/wsl) package will allow windows users to
follow the Ubuntu instructions.

**Course staff will make every attempt to assist you if you are using a platform that 
is not officially supported, but may lack the expertise needed to resolve your 
issue**.

### The Command Line

Instructions in class assignments will require running commands from the command line.
You'll need to access the command line with a terminal (type `terminal` in MacOS's 
spotlight or the Ubuntu launcher).  You should see a command prompt.  For example: 
```
-bash-4.2$ 
```
You can type commands at this prompt.  Commands usually have the form
```
[command name] [argument 1] [argument 2] [argument 3] ...
```
Common commands include:
* `pwd`: Print the current working directory (usually starts as `/home/[username]`)
* `ls`: List all the files in the current working directory
  * Files and directories starting with a `.` (dot) are "hidden".  To show hidden files and directories as well, use `ls -a` 
* `cd [dirname]`: Move the current working directory to `[dirname]`.  
  * `.` is a special directory name that refers to the current directory.  E.g., if your current working directory is `/home/zaphod` then `cd .` wouldn't change the directory at all.
  * `..` is a special directory name that refers to the parent directory.  E.g., if your current working directory is `/home/zaphod` then `cd ..` would move the working directory to `/home`
  * `~` (tilde) is a special directory name that refers to your home directory (typically `/home/[username]`).
* `man [command]`: Read the manual page for `[command]`.
* `cat [filename]`: Display (con**cat**enate to the console) the contents of `[filename]`. 

A package manager is like an app-store for the command line.  Ubuntu uses `apt`. MacOS
does not have a built-in package manager, but there are several that you can 
install.  This course assumes that you are using [Homebrew](https://brew.sh).  To
install a piece of software, type:
* **Ubuntu**: `apt install [name of package]`
* **MacOS**: `brew install [name of package]`

To find the name of a package, you can use:
* **Ubuntu**: `apt search [keywords]`
* **MacOS**: `brew search [keywords]`

### Editor + Mill

You will need a text editor and a Scala compiler for this course.  Popular editors 
include
* Emacs (`{brew/apt} install emacs`)
* Vim (`{brew/apt} install vim`)
* [SublimeText](https://www.sublimetext.com/)

Instructions for the course will be given using [SBT](https://www.scala-sbt.org/),
although other build tools exist.  For example, [mill](https://com-lihaoyi.github.io/mill/mill/Intro_to_Mill.html) 
and [bloop](https://scalacenter.github.io/bloop/) can be a little bit faster, but are
also a little less well-documented.

Install SBT with `{brew/apt} install sbt` or the instructions [here](https://www.scala-sbt.org/1.x/docs/Setup.html)

### IntelliJ

At your option, you may find it more convenient to use IDE (an all-in-one system that 
includes both an editor and a compiler).  A popular IDE for scala development that 
course staff are familiar with is [IntelliJ](https://www.jetbrains.com/idea/download/).
Installers for Ubuntu are available via [Flatpak](https://flatpak.org/setup/Ubuntu/).

You will need to install the **Scala** plugin (File → Settings → Plugins → Scala).

### Set up Microbase GIT

GIT uses Public/Private keys to authenticate you to the server.  Generate a 
public/private keypair (if you don't already have one) as follows: 
1. Open a terminal.
2. Type `ssh-keygen`
3. Follow the default prompts
4. Your public key is in `~/.ssh/id_rsa.pub` (remember that `~` is your home directory and that directory names starting with a `.` are hidden)
   * Your private key is in `~/.ssh/id_rsa`.  **Keep this file secret and safe!**

Next, you'll need to provide your **public** key to the server.   
1. Go to [https://microbase.cse.buffalo.edu/](https://microbase.cse.buffalo.edu/)
2. Enter your UB email address
3. Click the link in your email.  The token will be valid for 5 hours.
4. In the Key Management section of the page, enter a name for your computer in the appropriate box
5. Paste your **public** key (`~/.ssh/id_rsa.pub`) into the appropriate box. **DO NOT UPLOAD YOUR *PRIVATE* KEY**
  * **MacOS Shortcut**: `cat ~/.ssh/id_rsa.pub | pbcopy` copies your public key so you can paste it with Cmd-V.
  * **Ubuntu Shortcut**: `cat ~/.ssh/id_rsa.pub | xclip -i -selection clip` copies your public key so you can paste it with Ctrl-V.
6. Wait about 5 minutes.  You should be able to access your repository at `microbase@odin.cse.buffalo.edu:{YOUR UBIT}.git`

Initialize your repository as follows. Replacing `{YOUR UBIT}` with your UBIT, run 
the following from the working directory where you want your code to live.
```bash
git clone https://gitlab.odin.cse.buffalo.edu/cse-250/project-0.git
cd project-0
git remote rename origin instructor_code
git remote add origin microbase@odin.cse.buffalo.edu:{YOUR UBIT}.git
git push -u origin main
```

*If you are using IntelliJ, you may be asked if you want to import an SBT project 
when you first open the directory.  Say yes.*

This template project contains both SBT and IntelliJ workspaces. 


### NYS Open Data - Solar Installation Sites



## Revision History
* Fall 2021 - Oliver Kennedy (okennedy@buffalo.edu)
* Spring 2021 - Andrew Hughes (ahughes6@buffalo.edu)
