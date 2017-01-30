struct foo
{ int a; };

foo get();

int const b{ get().a }; // copy the xvalue
int const c{ std::move(get().a) }; // move the xvalue
