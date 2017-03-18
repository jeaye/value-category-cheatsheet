template <typename T>
T const& get(std::string const &key,
             T const &fallback)
{
  auto const &found(find(key)); // lvalue
  if(found) // lvalue
  { return *found; } // lvalue
  return fallback; // lvalue
}

int a{}; // lvalue
get("meow", a); // lvalue, well-defined
int const b{ get("meow", 0) }; // lvalue, well-defined
int const &c{ get("meow", 0) }; // lvalue, undefined
