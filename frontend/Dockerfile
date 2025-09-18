# Этап сборки (build stage)
FROM node:18-alpine AS builder

WORKDIR /app

# Копирование package.json и package-lock.json
COPY package*.json ./

# Установка зависимостей
RUN npm install --silent

COPY . .

# Сборка приложения
RUN npm run build

# Этап производства (production stage)
FROM nginx:alpine

# Копирование собранного приложения из этапа сборки
COPY --from=builder /app/dist /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf

# Экспозиция порта
EXPOSE 80

# Запуск Nginx
CMD ["nginx", "-g", "daemon off;"]