
__Investigating the new git autostash feature__
<!--break-->

## Why can't git....?

While recently teaching an introductory Git training course, I received an interesting question from some users that were currently using Mercurial. Paraphrasing a bit:

>"Why can't I pull when I have a dirty workspace, when Mercurial can do this out of the box?"

I gave the immediate answer that this is just Git's way of protecting the user from possibly harmful and, more importantly, irreversable changes. Git by default takes a very paranoid approach to any operations that change dirty files in your file system, when Git itself can't get you out of those changes again. _This is normally considered a feature_. The known "workaround", or possible workflow, is to stash any changes before doing a pull (with `git stash save`, and then unstash them again (`git stash pop`) when done. It seems obvious that it should be easy to automate this with a git alias, but it turns out that this isn't trivial, as git stash doesn't fail gracefully when there are no local changes.

## Git autostash
Following the training, I did a bit of thinking and reading up on recent changs to Git. It turns out that there is actually support for this in Git now and I thought it would be worth a short blog post.