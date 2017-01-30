struct foo
{ int a; };

foo get();

int const &b{ get().a }; // a is an xvalue
