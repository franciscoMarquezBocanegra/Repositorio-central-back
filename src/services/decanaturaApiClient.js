const URL = 'https://repositorio-central-backend.azurewebsites.net/';

export const decanaturaApiclient = (() => {
    return {
        getDecanaturas: async () => {
            return await fetch(`${URL}/U-cord/decanaturas`).then(response => {
                if (!response.ok) throw new Error('The response Failed');
                return response.json();
            });
        },
    };
})();
