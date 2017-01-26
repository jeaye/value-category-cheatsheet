struct foo
{ int a; };

foo get();

int const b{ foo().a }; // copy the xvalue
int const c{ std::move(foo().a) }; // move the xvalue
