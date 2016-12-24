template <typename T>
T get(std::string const &key,
      T const &fallback)
{
  auto const &found(find(key)); // lvalue
  if(found) // lvalue
  { return *found; } // lvalue
  return fallback; // lvalue
}

int a{}; // lvalue
get("meow", a); // prvalue
get("meow", 0); // prvalue
