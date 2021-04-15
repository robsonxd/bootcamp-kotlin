const BASE_API = 'https://api.b7web.com.br/devbarber/api';
//acima, entre aspas simples está a base da API

//vamos exportar abaixo um objeto que terá as ações que vamos precisar//
export default {
    checkToken: async (token) => {
        const req = await fetch(`${BASE_API}/auth/refresh`, {
            method: 'POST',
            headers:{
                Accept: 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({token})
        });
        const json = await req.json();
        return json;

    },
    signIn: async (email, password) => {
        console.log("email", email);
        console.log("password", password);

        const req = await fetch(`${BASE_API}/auth/login`, {
            method: 'POST',
            headers: {
                Accept: 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({email, password})
        });
        const json = await req.json();
        return json;
    },
    signUp: async (name, email, password) => {
        const req = await fetch(`${BASE_API}/user`, {
            method: 'POST',
            headers: {
                Accept: 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({name, email, password})
        });
        const json = await req.json();
        return json;
    }
};